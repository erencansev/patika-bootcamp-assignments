document.addEventListener("DOMContentLoaded", function () {
  const userInfoForm = document.getElementById("userInfoForm");
  const welcomeContainer = document.getElementById("welcomeContainer");
  const currentTimer = document.getElementById("currentTimer");
  const userNameInput = document.getElementById("userName");
  const welcomeMessage = document.getElementById("welcomeMessage");
  const currentTimeContainer = document.getElementById("currentTimeContainer");
  var confettiExecuted = false;

  function getCurrentTime() {
    let currentDate = new Date();
    let days = [
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
    ];
    let day = days[currentDate.getDay()];
    let hours = currentDate.getHours();
    let minutes = currentDate.getMinutes();
    let seconds = currentDate.getSeconds();
    hours = hours < 10 ? "0" + hours : hours;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;
    let currentTime = day + " " + hours + ":" + minutes + ":" + seconds;
    return currentTime;
  }

  function updateClock() {
    currentTimeContainer.textContent = getCurrentTime();
    requestAnimationFrame(updateClock);
  }

  userInfoForm.addEventListener("submit", function (event) {
    event.preventDefault();
    const userName = userNameInput.value;

    welcomeContainer.style.display = "none";

    welcomeMessage.textContent = "Welcome, " + userName + "!\t";
    currentTimer.style.display = "block";

    if (!confettiExecuted) {
      confettiAnimation();
      confettiExecuted = true;

      updateClock();
      currentTimer.style.display = "block";
    }
  });
});

function confettiAnimation() {
  var duration = 15 * 1000;
  var animationEnd = Date.now() + duration;
  var skew = 1;

  function randomInRange(min, max) {
    return Math.random() * (max - min) + min;
  }

  (function frame() {
    var timeLeft = animationEnd - Date.now();
    var ticks = Math.max(200, 500 * (timeLeft / duration));
    skew = Math.max(0.8, skew - 0.001);

    confetti({
      particleCount: 1,
      startVelocity: 0,
      ticks: ticks,
      origin: {
        x: Math.random(),
        y: Math.random() * skew - 0.2,
      },
      colors: ["#ffffff"],
      shapes: ["circle"],
      gravity: randomInRange(0.4, 0.6),
      scalar: randomInRange(0.4, 1),
      drift: randomInRange(-0.4, 0.4),
    });

    if (timeLeft > 0) {
      requestAnimationFrame(frame);
    }
  })();

  confetti({
    particleCount: 100,
    spread: 70,
    origin: { y: 0.6 },
  });
}
