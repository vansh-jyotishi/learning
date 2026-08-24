
function ColorButtons(props) {
    function changeColor(color) {
        document.querySelector('html').style.backgroundColor = color;
    }
    return (
        <button
            onClick={() => { changeColor(props.color) }}
            style={{
                backgroundColor: props.color,
                padding: 20,
                borderRadius: 50



            }}>change colour to : {props.color}</button>
    )

}
export default ColorButtons;