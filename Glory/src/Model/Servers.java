/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author I S Arandara
 */
public class Servers 
{
    public String serverName;
    public int numofPlayers;

    public Servers(String serverName, int numofPlayers) {
        this.serverName = serverName;
        this.numofPlayers = numofPlayers;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getNumofPlayers() {
        return numofPlayers;
    }

    public void setNumofPlayers(int numofPlayers) {
        this.numofPlayers = numofPlayers;
    }
}
