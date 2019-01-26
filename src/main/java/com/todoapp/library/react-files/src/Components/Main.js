import React, { Component } from "react";
import { Switch, Route } from 'react-router';
import User from './User';

class Main extends Component{
    render(){
        return (
            <div>
                <main>
                    <Switch>
                        <Route exact path="/" component={User}/>    
                    </Switch>
                </main>
            </div>
        )
    }
}

export default Main;