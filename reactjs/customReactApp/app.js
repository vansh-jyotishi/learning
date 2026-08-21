const root = document.getElementById("root"); //refrence of main container div "root" inside html

//custom element
let customReactElement = {
    type:"a",
    props:{
        href:"https://google.com",
        target:"_blank"
    },
    child:"go to google"
}

//custom renderer
function customRenderer(customElement,rootContainer){
    let domElement = document.createElement(customElement.type);
    domElement.innerText = customElement.child;
    for(let prop in customElement.props){
        domElement.setAttribute(prop,customElement.props[prop])
    }
    rootContainer.appendChild(domElement)
}

//calling renderer
customRenderer(customReactElement,root)