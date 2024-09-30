let bgContainerEl = document.createElement("div");
bgContainerEl.classList.add("bg-container");
document.body.appendChild(bgContainerEl);

let headingEl = document.createElement("h1");
headingEl.textContent = "Grocery List";
headingEl.classList.add("heading-el");
bgContainerEl.appendChild(headingEl);

let unorderList = document.createElement("ul");
unorderList.classList.add("unorder");
bgContainerEl.appendChild(unorderList);

// let listItem1 = document.createElement('li');
// listItem1.textContent ="Milk";
// listItem1.classList.add("listItems");
// unorderList.appendChild(listItem1);

// let listItem2 = document.createElement('li');
// listItem2.textContent ="Choco chips";
// listItem2.classList.add("listItems");
// unorderList.appendChild(listItem2);

// let listItem3 = document.createElement('li');
// listItem3.textContent ="Tomato Sauce";
// listItem3.classList.add("listItems");
// unorderList.appendChild(listItem3);

// let listItem4 = document.createElement('li');
// listItem4.textContent ="Cake";
// listItem4.classList.add("listItems");
// unorderList.appendChild(listItem4);

// let listItem5 = document.createElement('li');
// listItem5.textContent ="Noodles";
// listItem5.classList.add("listItems");
// unorderList.appendChild(listItem5);

let groceryItems = ["Milk","Choco chips","Tomato Sause","Cake","Noodles"];
for (let groceryItem of groceryItems) {
    let listItem = document.createElement('li');
    listItem.textContent =groceryItem;
    listItem.classList.add("listItems");
    unorderList.appendChild(listItem);
}
let checkBox = document.createElement("input");
checkBox.type = "checkbox";
checkBox.id = "delivery";
bgContainerEl.appendChild(checkBox);

let labelEL = document.createElement("label");
labelEL.classList.add("label-head");
labelEL.setAttribute("for","delivery");
labelEL.textContent = "Need Home Delivery";
bgContainerEl.appendChild(labelEL);

let brEl = document.createElement("br");
bgContainerEl.appendChild(brEl);

let btnEl = document.createElement("button");
btnEl.classList.add("btn","btn-primary","btns");
btnEl.textContent = "Proceed to Buy";
bgContainerEl.appendChild(btnEl);