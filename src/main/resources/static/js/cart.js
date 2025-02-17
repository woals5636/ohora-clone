document.addEventListener("DOMContentLoaded", function () {
    if (userPk == 0) {
        $(".cart-in img").on("click", function () {
            const pdtId = $(this).data("pdtid");
            addToCart(pdtId);
            updateCartCount();
        });
    } else {
        $(".cart-in img").on("click", function () {
            const pdtId = $(this).data("pdtid");
            console.log(userPk, pdtId);
            checkCart(userPk, pdtId);
        });
    }

    var csrfHeaderName = "${_csrf.headerName}";
    var csrfTokenValue = "${_csrf.token}";
    let isProcessing = false;

    async function checkCart(userPk, pdtId) {
        if (isProcessing) return;
        isProcessing = true;

        try {
            const response = await $.ajax({
                url: "/checkcart.ajax",
                type: "GET",
                dataType: "json",
                data: { userPk, pdtId }
            });

            if (response.status === "empty") {
                await addToUserCart(userPk, pdtId);
            } else {
                if (confirm("장바구니에 동일한 상품이 있습니다.\r\n장바구니에 추가하시겠습니까?")) {
                    await updateCart(userPk, pdtId);
                }
            }
        } catch (error) {
            console.error("error:", error);
        } finally {
            isProcessing = false;
        }
    }

    async function addToUserCart(userPk, pdtId) {
        try {
            const response = await $.ajax({
                url: "/addcart.ajax",
                type: "POST",
                dataType: "json",
                data: { userPk, pdtId },
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
                }
            });

            if (response.status === "success") {
                alert("상품이 장바구니에 추가되었습니다.");
                $(".EC-Layout-Basket-count").text(response.count);
            } else {
                alert("장바구니 추가 실패");
            }
        } catch (error) {
            console.error("insert failed:", error);
        }
    }

    async function updateCart(userPk, pdtId) {
        try {
            const response = await $.ajax({
                url: "/updatecart.ajax",
                type: "POST",
                dataType: "json",
                data: { userPk, pdtId },
                beforeSend: function (xhr) {
                    xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);
                }
            });

            if (response.status === "success") {
                alert("장바구니 상품 수량이 증가되었습니다.");
            } else {
                alert("장바구니 추가 실패");
            }
        } catch (error) {
            console.error("update failed:", error);
        }
    }

    function updateCartCount() {
        const cartItems = getCartItems();
        const uniquePdtIds = new Set(cartItems.map(item => item.pdtId));
        const cartCount = uniquePdtIds.size;
        $(".count.EC-Layout-Basket-count").text(cartCount);
    }

    function addToCart(pdtId) {
        let cartItems = getCartItems();
        const existingItem = cartItems.find(item => item.pdtId === pdtId);

        if (existingItem) {
            const userConfirmed = confirm("같은 상품이 존재합니다. 추가하시겠습니까?");
            if (!userConfirmed) return;
            existingItem.quantity += 1;
        } else {
            cartItems.push({ pdtId: pdtId, quantity: 1 });
        }
        const cartString = cartItems.map(item => `${item.pdtId}:${item.quantity}`).join("|");
        CookieUtil.setCookie("cartItems", cartString, 14);
        alert("장바구니에 상품이 추가되었습니다.");
    }

    if (userPk == 0) {
        updateCartCount();
    }
});
