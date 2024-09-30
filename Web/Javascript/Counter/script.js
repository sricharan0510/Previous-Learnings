let c = document.getElementById('counterValue');
function incresefn() {
    let p = c.textContent;
    let n = parseInt(p)+1;
    if (n>0){
        c.style.color="green";
    }
    else if (n<0){
        c.style.color="red";
    }
    else {
        c.style.color="black";
    }
    c.textContent=n;
}
function decresefn() {
    let p = c.textContent;
    let n = parseInt(p)-1;
    if (n>0){
        c.style.color="green";
    }
    else if (n<0){
        c.style.color="red";
    }
    else {
        c.style.color="black";
    }
    c.textContent=n;
}
function resetfn(){
    let m=0;
    c.textContent=m;
    c.style.color="black";
}