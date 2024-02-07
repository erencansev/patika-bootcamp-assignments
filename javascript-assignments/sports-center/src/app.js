document.addEventListener("DOMContentLoaded", function () {
  const burgerMenu = document.querySelector(".burger-menu");
  const navItems = document.querySelector(".nav-item");
  burgerMenu.addEventListener("click", function () {
    navItems.style.display =
      navItems.style.display === "flex" ? "none" : "flex";
  });
  navItems.addEventListener("click", function () {
    navItems.style.display = "none";
  });
});
