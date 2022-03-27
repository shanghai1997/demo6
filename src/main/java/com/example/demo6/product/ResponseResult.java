package com.example.demo6.product;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {
    public List<Naizi> naiZis;
    public JiBa jiBa;

    public class Naizi {
        public String chiCun;
    }

    public class JiBa {
        public int changDu;
        public NaiTou naiTou;

        public class NaiTou {
            public String yanSe;
        }
    }

    public static void main(String[] args){
        String json = "{\"naiZis\":[{\"chiCun\":\"xiXiXi\"},{\"chiCun\":\"haHaHa\"}],\"jiBa\":{\"changDu\":5,\"naiTou\":{\"yanSe\":\"yellow\"}}}";
        ResponseResult responseResult = new Gson().fromJson(json, ResponseResult.class);
        System.out.println("the value of fist ChiCun is " + responseResult.naiZis.get(0).chiCun);
        System.out.println("the value of second ChiCun is " + responseResult.naiZis.get(1).chiCun);
        System.out.println("the value of second changDu is " + responseResult.jiBa.changDu);
        System.out.println("the value of yanSe is " + responseResult.jiBa.naiTou.yanSe);
    }
}
