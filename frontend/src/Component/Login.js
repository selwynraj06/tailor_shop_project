import { useState } from "react";
import "./Login.css";

function Login() {
    
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");

    function loginHandler(){
        setMessage("Loading...");
        if(email === "selwynraj@gmail.com" && password === "12345"){
            setTimeout(() =>{
                setMessage("Login Successfull");
            },3000);
            
        }
        else{
            setTimeout(() =>{
                 setMessage("Login Failed");
            },3000);
           
        }
    }

    return (
        <>
        <div className="LoginHeader">
            <h2>Shilpy</h2>
        </div>
        <div className="LoginBox">
            <h1>Login</h1>
            <br/>
            <input className="LoginInput" type="text" placeholder="Email" onChange={(e) => setEmail(e.target.value)}/>
            <br/>
            <input className="LoginInput" type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)}/>
            <br/>
            <button onClick={loginHandler}>Sign In</button>
            {message && <p>{message}</p>}
        </div>
        </>
    )
}
export default Login;