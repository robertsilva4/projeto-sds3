import Dashboard from "pages/Dashboard";
import Home from "pages/Home";
import { Route } from "react-router-dom";
import { BrowserRouter } from "react-router-dom";

function Routes() {
    return (
        <BrowserRouter>
            <Route component={Home} path="/" exact />
            <Route component={Dashboard} path="/dashboard" />
        </BrowserRouter>
    );
}

export default Routes;