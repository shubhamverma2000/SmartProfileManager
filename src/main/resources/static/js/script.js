console.log("script.js loaded");

let currentTheme= getTheme();
console.log("current theme ", currentTheme);
changeTheme();

//change theme
function changeTheme(){
    addThemeOnPage(currentTheme);
    const changeThemeBtn = document.getElementById("theme_change_button");
    const themeIcon = document.getElementById("themeIcon");
    themeIcon.style.color =  currentTheme === "dark" ? "#FFD43B" : "#0f0f10";
    changeThemeBtn.addEventListener("click" , (event) =>{
        removeThemeOnPage(currentTheme);
        currentTheme = currentTheme === "dark" ? "light" : "dark";
        setTheme(currentTheme);
        addThemeOnPage(currentTheme);
        themeIcon.style.color =  currentTheme === "dark" ? "#FFD43B" : "#0f0f10";
    });


}

//add theme class to page
function addThemeOnPage(currentTheme){
    document.querySelector("html").classList.add(currentTheme);
}

//remove theme class to page
function removeThemeOnPage(currentTheme){
    document.querySelector("html").classList.remove(currentTheme);
}


//set theme to local storage
function setTheme(theme){
    localStorage.setItem("currentTheme" , theme);
}

//get theme from local storage
function getTheme(){
   let theme = localStorage.getItem("currentTheme");
   return theme ? theme : "light";
}
