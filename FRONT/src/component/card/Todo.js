import React from 'react';
import Typography from "@material-ui/core/Typography";
import CardContent from "@material-ui/core/CardContent";
import fondo from "../img/Task.png"

export class Todo extends React.Component {


    render() {
        return (  
            <CardContent>
        
               <Typography gutterBottom variant="h5" component="h2">
                                {this.props.text}
                </Typography>
                <Typography variant="body2" color="white" component="p">
                        {" Date " + this.props.dueDate.split("T")[0]}
                </Typography>

                <Typography variant="body2" color="white" component="p">
                        {" Status " + this.props.status}
                </Typography>
            
                <Typography variant="body2" color="white" component="p">
                        {" Email resposible " + this.props.email}
                </Typography>

            </CardContent>
        );
    }

}