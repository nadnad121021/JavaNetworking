/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author alingasada_sd2021
 */
public class Client extends JFrame{

    public Client(String host) {
        super("Client");
    }
    
}
