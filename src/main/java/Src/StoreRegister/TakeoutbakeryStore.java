/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src.StoreRegister;

/**
 *
 * @author sejin
 */
public class TakeoutbakeryStore extends Store {
          public TakeoutbakeryStore(String id){
            storename= id+"의 빵집";
            this.id = id;
            tabletype = "TakeOut";
            storeaddress = "주소를 변경하세요";
            storetel = "전화번호를 변경하세요";
            open_time = 9;
            close_time = 18;
            max = 200;
    }     
}
