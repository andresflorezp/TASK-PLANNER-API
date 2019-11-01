import React from 'react'
import Container from '@material-ui/core/Container'
import Avatar from '@material-ui/core/Avatar'
import { withStyles } from '@material-ui/core/styles';
import PropTypes from 'prop-types';
import './SignIn.css'
import LockOutlinedIcon from '@material-ui/icons/LockOutlined';
import Typography from '@material-ui/core/Typography'
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import {Link} from 'react-router-dom';
import axios from 'axios';
import Logo from '../img/Logo.png'

const imgUrl = process.env.PUBLIC_URL + '/SignIn/footer.png'

const useStyles = theme => ({
    avatar: {
        margin: theme.spacing(3),
        backgroundColor: theme.palette.secondary.main,
    },
    paper: {
        marginTop: theme.spacing(8),
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',

    },
    rightIcon: {
        marginLeft: theme.spacing(1),
    },
    root: {
        backgroundImage: `url(${imgUrl})`,
    },
    multilineColor: {
        backgroundColor: 'white'
    },
});



class SingIn extends React.Component {
    //className={classes.avatar}
    constructor(props){
        super(props);
        localStorage.setItem("tdList" , JSON.stringify( [ JSON.stringify({
            text: "Componente uno",
            email : "anflo@gmail.com",
            name  : "Andres",
            dueDate: new Date(),
            status: "pending"
        }),
        JSON.stringify({
            text: "Crear nueva tarea",
            email : "juan@mail.com",
            name  : "Juanpa",
            dueDate: new Date(),
            status: "done"
        }),
      
    
        ]));

    }

    async loginSubmit() {
        const email = document.getElementById("email").value;
        const psw = document.getElementById("password").value;
        console.log(email + " " + psw)
        if (email !== "" && psw !== "") {
            axios.post('http://localhost:8080/api/login', {
             userName: email,
             password: psw 
            }).then(function (response) {
                localStorage.setItem("isLoggedin", true);
                localStorage.setItem("mailLogged", email);
                localStorage.setItem("passwordLogged", psw);
                localStorage.setItem("Bearer",response.data.accessToken)
                window.location.href = "/index";
                console.log(response.data);
            }).catch(function (error) {
                console.log(email + "  " + psw);
                alert("No es posible logearse")
                 console.log(error);
             });
        }
    }


    render() {
        const { classes } = this.props;
        return (
     
                <div>
                    <Container maxWidth='xl' >
                        <div className={classes.paper}>
                            <img src={Logo} style={{width:"10%",height:"10%"}}alt=""/>
                            <br/><br/>
                        
                            
                            
                            <Typography component="h1" variant="h5">
                                Sign in
                                </Typography>
                            <TextField
                                label="Email"
                                InputProps={{
                                    className: classes.multilineColor
                                }}
                                variant="outlined"
                                id="email"
                                type="email"
                                name="email"
                                autoComplete="email"
                                margin="normal"
                               
                            />
                            <TextField
                                InputProps={{
                                    className: classes.multilineColor
                                }}
                                variant="outlined"
                                id="password"
                                label="Password"
                                type="password"
                                autoComplete="current-password"
                                margin="normal"
                                
                            />
                            <br></br>
                            <Button type="submit" 
                                
                                className={classes.button}
                                style={{ backgroundColor: "#001f3f", color: "white",width:"30%" }}
                                variant="contained" onClick={this.loginSubmit}>
                                Login
                        </Button>
                        <br/>
                            <div style={{ paddingLeft: 150 }}>
                                <Grid container justify="center">
                                    <Grid item>
                                        <Link style={{textDecoration:"none"}}to="/singUp">
                                            Create your Account
                                        </Link>
                                    </Grid>
                                </Grid>
                            </div>
                        </div>

                    </Container>

                
                </div>
        );
    }
}


SingIn.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(useStyles)(SingIn);
