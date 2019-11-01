import React from 'react'
import Drawer from '@material-ui/core/Drawer';
import Button from '@material-ui/core/Button';
import List from '@material-ui/core/List';
import Divider from '@material-ui/core/Divider';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import InboxIcon from '@material-ui/icons/MoveToInbox';
import { withStyles } from '@material-ui/core/styles';
import PropTypes from 'prop-types';
import DataUsageIcon from '@material-ui/icons/DataUsage';
import FolderIcon from '@material-ui/icons/Folder'
import './UserTab.css';
import SearchIcon from '@material-ui/icons/Search';
import {Link} from 'react-router-dom';
import axios from 'axios';



const useStyles  = theme =>  ({
    list: {
        width: 250,
    },
    fullList: {
        width: 'auto',
    },
    button : {
        margin: theme.spacing.unit, // You might not need this now
        position: "absolute",
        bottom: theme.spacing.unit ,
        right: theme.spacing.unit
    },
    iconHover : {
        color : "#001f3f",

    }
});


class Menu extends React.Component {

    constructor(props) {
        super(props);
        this.state = { open: false };
        this.handleOpen = this.handleOpen.bind(this);
        this.handleClose = this.handleClose.bind(this);
    }

    logout() {
        localStorage.removeItem("isLoggedin");
        window.location.href = "/";
    }


    handleOpen(e) {

        this.setState({ open: true });
    }

    handleClose(e) {
        this.setState({ open: false });
    }




    render() {
        const { classes } = this.props;
        return (
            <div>
                
                <Button onClick={this.handleOpen} style= {{top:0, left:0}} >
                    <FolderIcon style={{width:"40px",height:"40px"}}/>
                    <h1>Task</h1>
                </Button>
      
               

                <Drawer open={this.state.open} onClose={this.handleClose}>
                    <div
                        className={classes.list}
                        role="presentation"
                        onClick={this.handleClose}
                        style = {{
                            }} 
                        >
                        <List>
                            <ListItem>

                                <ListItemText>
                                    Andres Florez
                                </ListItemText> 
                            </ListItem> 


                            <ListItem button component={Link} to="/index">
                                <ListItemIcon>
                                    <InboxIcon />
                                </ListItemIcon>
                                <ListItemText primary={'Index'}/>    
                            </ListItem > 
                            <ListItem button component={Link} to="/editprofile">
                                <ListItemIcon>
                                    <InboxIcon />
                                </ListItemIcon>
                                <ListItemText primary={'Edit profile'}/>    
                            </ListItem > 

                            <ListItem button component={Link} to="/filter">
                                <ListItemIcon>
                                    <InboxIcon />
                                </ListItemIcon>
                                <ListItemText primary={'Filter'}/>    
                            </ListItem > 
                        
                        </List>
                        <Divider/>
                        <Button className = {classes.button} style = {{
                                            backgroundColor: "#FF4136",color : "white"}} 
                                        variant="contained" 
                                        onClick={this.logout}>
                                        LogOut
                        </Button>
                    </div>
                </Drawer>
            </div>
        );
    }
}

Menu.propTypes = {
    classes: PropTypes.object.isRequired,
};

export default withStyles(useStyles)(Menu);