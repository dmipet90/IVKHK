/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testFactory3;

import FactoryMethodWithArray.Employee;

/**
 *
 * @author User
 */
public class Tester implements Employee{

    @Override
    public void doWork() {
        System.out.println("I'm tester. I testing code!");
    }
    
}