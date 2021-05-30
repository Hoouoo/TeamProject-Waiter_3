/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src.SignUp_BuilderPattern;

/**
 *
 * @author 박성호
 */
public class StoreManagerBuilder extends MemberBuilder{
    
    protected String storetype;
    
//    public StoreManagerBuilder(int idx, String id, String pw, String name, String tel, String address, String storetype){
//        this.idx = idx;
//        this.id = id;
//        this.pw = pw;
//        this.name = name;
//        this.tel = tel;
//        this.address = address;
//        this.storetype = storetype;     
//    }

    public StoreManagerBuilder setStoretype(String storetype) {
        this.storetype = storetype;
        return this;
    }
    
       @Override
    public SignUpProduct build(){
        
        return new SignUpProduct(this);
    } 
}
