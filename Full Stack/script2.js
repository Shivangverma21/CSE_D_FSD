/* let countdown;
let isRunning = false;
let timeLeft = 10 * 60;  
const timerElement = document.getElementById("timer");
const startButton = document.getElementById("startBtn");
function formatTime(seconds) {
    const minutes = Math.floor(seconds / 60);
    const remainingSeconds = seconds % 60;
    return `${pad(minutes)}:${pad(remainingSeconds)}`;
}
function pad(number) {
    return number < 10 ? "0" + number : number;
}
function updateTimer() {
    timerElement.textContent = formatTime(timeLeft);
}
function startCountdown() {
    if (isRunning) return;  
    isRunning = true;
    startButton.textContent = "Pause Countdown";
    countdown = setInterval(() => {
        if (timeLeft > 0) {
            timeLeft--;
            updateTimer();
        } else {
            clearInterval(countdown);
            alert("Time's up!");
            startButton.textContent = "Start Countdown";
            isRunning = false;
        }
    }, 1000);
}
function resetTimer() {
    timeLeft = 10 * 60; 
    updateTimer();
}
startButton.addEventListener("click", function() {
    if (isRunning) {
        clearInterval(countdown);
        startButton.textContent = "Start Countdown";
        isRunning = false;
    } else {
        startCountdown();
    }
});
updateTimer(); */



let countdown, isRunning = false, timeLeft = 10 * 60;
const timerElement = document.getElementById("timer");
const startButton = document.getElementById("startBtn");

function formatTime(seconds) {
    return `${String(Math.floor(seconds / 60)).padStart(2, '0')}:${String(seconds % 60).padStart(2, '0')}`;
}

function updateTimer() {
    timerElement.textContent = formatTime(timeLeft);
}

function startCountdown() {
    if (isRunning) return;
    isRunning = true;
    startButton.textContent = "Pause Countdown";
    countdown = setInterval(() => {
        if (timeLeft-- > 0) updateTimer();
        else {
            clearInterval(countdown);
            alert("Time's up!");
            startButton.textContent = "Start Countdown";
            isRunning = false;
        }
    }, 1000);
}

startButton.addEventListener("click", () => {
    isRunning ? (clearInterval(countdown), startButton.textContent = "Start Countdown", isRunning = false) : startCountdown();
});

updateTimer();