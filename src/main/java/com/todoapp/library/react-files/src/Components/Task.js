import React, {Component} from "react";

class Task extends Component{
    constructor(){
        super(this);
        this.state ={
                 tasks: []
        }
    }

    render(){
        return (
            <div>
                <h3>The Task</h3>
            </div>
        )
    }
}