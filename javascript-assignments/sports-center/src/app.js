document.addEventListener("DOMContentLoaded", function () {
  const header = document.querySelector(".nav-container");

  window.addEventListener("scroll", function () {
    let scrollTop = window.scrollY || document.documentElement.scrollTop;

    if (scrollTop > 50) {
      header.classList.add("scrolled");
    } else {
      header.classList.remove("scrolled");
    }
  });
});
document.addEventListener("DOMContentLoaded", function () {
  const toggleButton = document.querySelector(".toggle-menu");
  const navItem = document.querySelector(".nav-item");

  toggleButton.addEventListener("click", function () {
    navItem.classList.toggle("show");
  });

  const navLinks = document.querySelectorAll(".nav-item a");

  navLinks.forEach(function (link) {
    link.addEventListener("click", function () {
      navItem.classList.remove("show");
    });
  });
});
/* bmi */
