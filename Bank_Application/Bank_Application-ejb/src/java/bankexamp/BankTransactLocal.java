/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexamp;

import javax.ejb.Local;

/**
 *
 * @author Shubham
 */
@Local
public interface BankTransactLocal {

    int deposit(int amount);

    /**
     *
     * @param amount
     * @return
     */
    int withdraw(int amount);
    
}

