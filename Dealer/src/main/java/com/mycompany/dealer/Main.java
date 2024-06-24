/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dealer;

/**
 *
 * @author D-10
 */
public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Yaris", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Jazz RS GK5", 2018, 200000000);
        Dealer dealer = new Dealer("Auto2000", mobilBaru, mobilBekas);
        dealer.info();
    }
}

