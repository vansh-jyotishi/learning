
import ColorButtons from "./ColorButtons";
function NavBar() {
    let colorArr = ["green", "white", "yellow", "red", "grey", "blue"];

    return (
        <div style={{
            display: "flex",
            flexDirection: "row",
            alignItems: "center",
            justifyContent: "space-evenly",
            backgroundColor: "gold",
            padding: 20,
            borderRadius: 50
        }}>
            <ColorButtons color={colorArr[0]}></ColorButtons>
            <ColorButtons color={colorArr[1]}></ColorButtons>
            <ColorButtons color={colorArr[2]}></ColorButtons>
            <ColorButtons color={colorArr[3]}></ColorButtons>
            <ColorButtons color={colorArr[4]}></ColorButtons>
            <ColorButtons color={colorArr[5]}></ColorButtons>
        </div>
    )
}
export default NavBar;