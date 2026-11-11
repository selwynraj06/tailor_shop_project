import { render,screen } from "@testing-library/react"
import Login from "../Component/Login";

test("Check the component loaded or not",() => {
    //steps for test
    render(<Login/>);
    expect(screen.queryByText(/Login/)).toBeInTheDocument();
})

test("Checking the email and password fields are empty or not",() => {
    render(<Login/>);
    expect(screen.queryByPlaceholderText("Email")).toHaveValue("");
    expect(screen.queryByPlaceholderText("Password")).toHaveValue("");
})