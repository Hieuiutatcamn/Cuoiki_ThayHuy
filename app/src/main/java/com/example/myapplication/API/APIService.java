package com.example.myapplication.API;

import com.example.ltdd_suaxe.Model.CapNhatCuaHangRequest;
import com.example.ltdd_suaxe.Model.CapNhatCuaHangResponse;
import com.example.ltdd_suaxe.Model.CapNhatKhachHangRequest;
import com.example.ltdd_suaxe.Model.ChiTietDatHangResponse;
import com.example.ltdd_suaxe.Model.CuaHang;
import com.example.ltdd_suaxe.Model.DangKyCuaHangRequest;
import com.example.ltdd_suaxe.Model.DangKyKhachHangRequest;
import com.example.ltdd_suaxe.Model.DoiMatKhauRequest;
import com.example.ltdd_suaxe.Model.DonSuaChuaRequest;
import com.example.ltdd_suaxe.Model.DonSuaChua_Daxacnhan;
import com.example.ltdd_suaxe.Model.DonYeuCau;
import com.example.ltdd_suaxe.Model.LoginCuaHangResponse;
import com.example.ltdd_suaxe.Model.LoginRequest;
import com.example.ltdd_suaxe.Model.LoginResponse;
import com.example.ltdd_suaxe.Model.Quan;
import com.example.ltdd_suaxe.Model.ResponseChung;
import com.example.ltdd_suaxe.Model.User;
import com.example.myapplication.Model.CapNhatKhachHangRequest;
import com.example.myapplication.Model.ResponseChung;
import com.example.myapplication.Model.User;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @GET("users")  // Đây là endpoint API bạn cung cấp
    Call<List<User>> getUsers();

    @GET("users/detail/{userId}")  // Lấy ra tông tin cá nhân khách hàng
    Call<User> getUserDetail(@Path("userId") String userId);

    @POST("users/update/{userId}")  //Cập nhật thông tin khách hàng
    Call<ResponseChung> updateUser(@Path("userId") String userId, @Body CapNhatKhachHangRequest capNhatKhachHangRequest);


}

