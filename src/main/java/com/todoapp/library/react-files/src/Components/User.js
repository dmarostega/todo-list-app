import React, { Component } from "react";
import axios from "axios";
import UserItem from './UserItem';  

class User extends Component{
    constructor(){
        super();

        this.state = {
            users : []
        }
    }
    componentWillMount(){
        this.getUser();
    }
    getUser(){
       /**/ axios('http://localhost:8080/alluser').then(response=>{
            this.setState({users: response.data},
                ()=>{
                    console.log(this.state);
                })
        })
    }
    render(){
        var userItem = this.state.users.map((user, i) => {
            return(
                <UserItem key={user.id} item={user} />
            )
        })
        return (
            <div>
                <h3>GIB USERS</h3>
                <ul>
                    {userItem}
                </ul>
            </div>
        );
    }
}

export default User;