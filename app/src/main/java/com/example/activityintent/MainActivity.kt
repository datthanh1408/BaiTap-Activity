// ======================================================
// PHẦN 1: PACKAGE
// Xác định file MainActivity.kt thuộc package nào.
// ======================================================

package com.example.activityintent   // package = khai báo gói; đây là package của ứng dụng


// ======================================================
// PHẦN 2: IMPORT
// Nhập các class cần sử dụng trong MainActivity.
// ======================================================

import android.content.Intent                    // Intent → dùng để chuyển từ Activity này sang Activity khác
import android.os.Bundle                         // Bundle → chứa trạng thái/dữ liệu khi Activity được tạo lại
import android.widget.Button                     // Button → cho phép Kotlin làm việc với Button trong XML
import androidx.appcompat.app.AppCompatActivity  // AppCompatActivity → lớp nền để tạo một Activity


// ======================================================
// PHẦN 3: KHAI BÁO MAIN ACTIVITY
// Tạo class MainActivity và cho nó kế thừa AppCompatActivity.
// ======================================================

class MainActivity : AppCompatActivity() {       // class = tạo lớp | : = kế thừa | MainActivity là một Activity


    // ==================================================
    // PHẦN 4: onCreate()
    // Hàm được Android gọi khi MainActivity được tạo.
    // ==================================================

    override fun onCreate(                       // override = ghi đè hàm có sẵn | fun = khai báo hàm
        savedInstanceState: Bundle?              // savedInstanceState = trạng thái cũ | Bundle? = có thể null
    ) {

        super.onCreate(savedInstanceState)       // super = lớp cha | chạy phần khởi tạo Activity mặc định


        // ==================================================
        // PHẦN 5: GẮN GIAO DIỆN XML
        // Cho MainActivity sử dụng activity_main.xml.
        // ==================================================

        setContentView(R.layout.activity_main)   // R = tài nguyên | layout = thư mục layout | activity_main = file XML


        // ==================================================
        // PHẦN 6: TÌM BUTTON TRONG XML
        // Lấy Button btnDetail để Kotlin có thể điều khiển nó.
        // ==================================================

        val btnDetail =                          // val = khai báo biến không gán lại | btnDetail = tên biến
            findViewById<Button>(                // findViewById = tìm View theo ID | <Button> = View cần tìm là Button
                R.id.btnDetail                   // R.id = khu vực ID | btnDetail = ID đã khai báo bên XML
            )


        // ==================================================
        // PHẦN 7: XỬ LÝ KHI BẤM BUTTON
        // Code bên trong { } chỉ chạy khi btnDetail được bấm.
        // ==================================================

        btnDetail.setOnClickListener {           // . = gọi chức năng | setOnClickListener = lắng nghe sự kiện click


            // ==============================================
            // PHẦN 8: TẠO INTENT
            // Tạo yêu cầu chuyển MainActivity → DetailActivity.
            // ==============================================

            val intent =                         // val = tạo biến | intent = tên biến chứa Intent
                Intent(                          // Intent(...) = tạo một đối tượng Intent
                    this,                        // this = Activity hiện tại → ở đây chính là MainActivity
                    DetailActivity::class.java   // DetailActivity = đích | ::class.java = lấy class của Activity đích
                )


            // ==============================================
            // PHẦN 9: THỰC HIỆN INTENT
            // Yêu cầu Android mở DetailActivity.
            // ==============================================

            startActivity(intent)                // startActivity = mở Activity | intent = yêu cầu vừa tạo
        }                                        // } kết thúc code xử lý sự kiện click
    }                                            // } kết thúc hàm onCreate()
}                                                // } kết thúc class MainActivity