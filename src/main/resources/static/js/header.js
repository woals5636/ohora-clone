// 로그인된 사용자 ID 가져오기
var userPk = 0; // 기본값

document.addEventListener("DOMContentLoaded", function () {
    var userPkElement = document.getElementById("userPk");
    if (userPkElement) {
        userPk = userPkElement.getAttribute("data-userid") || 0;
    }
    console.log("User ID:", userPk);

    if (userPk != 0) {
        initCartCount(userPk);
    } else {
        updateCartCount();
    }

    initSwiper();
    initSlickSlider();
    initSearchAndCategoryToggle();
});

// 장바구니 개수 초기화
function initCartCount(userPk) {
    $.ajax({
        url: "/initcart.ajax",
        type: "GET",
        dataType: "json",
        data: { userPk },
        success: function (response) {
            $(".EC-Layout-Basket-count").text(response.count);
        }
    });
}

// Swiper 초기화
function initSwiper() {
    var swiper1 = new Swiper(".mySwiper", {
        loop: true,
        pagination: {
            el: ".swiper-pagination",
            centeredSlides: true,
            clickable: true,
            renderBullet: function (index, className) {
                return '<span class="' + className + '">' + (index + 1) + "</span>";
            }
        }
    });

    var swiper2 = new Swiper(".mySwiper2", {
        slidesPerView: "auto",
        scrollbar: {
            el: ".swiper-scrollbar",
            hide: false,
            draggable: true
        },
        navigation: {
            nextEl: ".swiper-button-next",
            prevEl: ".swiper-button-prev"
        }
    });

    var swiper3 = new Swiper(".mySwiper3", {
        slidesPerView: "auto",
        scrollbar: {
            el: ".swiper-scrollbar",
            hide: false,
            draggable: true
        },
        navigation: {
            nextEl: ".swiper-button-next2",
            prevEl: ".swiper-button-prev2"
        }
    });

    var swiper4 = new Swiper(".mySwiper4", {
        loop: true
    });

    var swiper5 = new Swiper(".mySwiper5", {
        effect: "coverflow",
        grabCursor: true,
        centeredSlides: true,
        slidesPerView: "auto",
        loop: true,
        coverflowEffect: {
            rotate: 50,
            stretch: 0,
            depth: 100,
            modifier: 1,
            slideShadows: true
        }
    });
}

// Slick 슬라이더 초기화
function initSlickSlider() {
    $(".slide_banner_top").slick({
        infinite: true,
        speed: 300,
        slidesToShow: 1,
        dots: false,
        arrows: false,
        autoplay: true,
        autoplaySpeed: 3000,
        swipe: true,
        pauseOnHover: false
    });
}

// 검색 및 카테고리 토글
function initSearchAndCategoryToggle() {
    const searchContainer = $(".hd_search_container");
    const cateContainer = $(".hd_cate_container");

    searchContainer.hide();
    cateContainer.hide();

    $(".small_icon.search_fixed_btn").on("click", function () {
        if (!searchContainer.is(":visible")) {
            cateContainer.stop(true, true).fadeOut(300, function () {
                searchContainer.stop(true, true).slideDown(500).animate({ opacity: 1 }, { duration: 10 });
                $("#keyword").focus();
            });
        } else {
            searchContainer.stop(true, true).slideUp(500).animate({ opacity: 0 }, { duration: 10 });
        }
    });

    $(".SMS_menu").on("click", function () {
        if (!cateContainer.is(":visible")) {
            searchContainer.stop(true, true).fadeOut(300, function () {
                cateContainer.stop(true, true).slideDown(500).animate({ opacity: 1 }, { duration: 10 });
                $("#keyword").focus();
            });
        } else {
            cateContainer.stop(true, true).slideUp(500).animate({ opacity: 0 }, { duration: 10 });
        }
    });
}
