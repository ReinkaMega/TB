/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

import koneksi.SettingUI;

/**
 *
 * @author Deny SQP
 */
public class Connect {
    
    public SettingUI config = new SettingUI(null, true);

    public void koneksi() {
        config.setServer("localhost");
        config.setUser("root");
        config.setPassword("");
        config.setDatabase("inventaris");
        config.makeConnect();
    }

}
