# Aplikasi FoodService - Proyek UTS Pemrograman Mobile

Repositori ini berisi kode sumber untuk proyek Ujian Tengah Semester (UTS) mata kuliah **Pemrograman Mobile**. `FoodService` adalah sebuah prototipe aplikasi mobile pemesanan makanan yang dibangun secara *native* untuk platform Android menggunakan bahasa Kotlin.

## 📄 Deskripsi Proyek

Aplikasi ini dirancang untuk mensimulasikan alur dasar dari layanan pemesanan makanan. Aplikasi mencakup fungsionalitas inti mulai dari otentikasi pengguna, menampilkan menu, hingga proses konfirmasi pesanan. Proyek ini bertujuan untuk mendemonstrasikan pemahaman konsep dasar pengembangan aplikasi Android, termasuk manajemen state, navigasi antar layar, dan interaksi pengguna.

## ✨ Fitur Utama

Aplikasi ini memiliki alur yang sederhana dengan fitur-fitur sebagai berikut:

  * **Otentikasi Pengguna**:
      * **Halaman Register**: Untuk pendaftaran pengguna baru.
      * **Halaman Login**: Untuk masuk bagi pengguna yang sudah terdaftar.
  * **Halaman Menu**: Setelah berhasil login, pengguna akan disajikan daftar makanan yang tersedia untuk dipesan.
  * **Detail Pesanan (Order Details)**: Halaman untuk meninjau kembali item-item yang telah dipilih (berfungsi seperti keranjang belanja) sebelum melakukan konfirmasi.
  * **Konfirmasi Pesanan (Order Confirmation)**: Halaman akhir yang memberikan konfirmasi kepada pengguna bahwa pesanan mereka telah berhasil dibuat.

## 🛠️ Teknologi dan Arsitektur

  * **Bahasa Pemrograman**: **Kotlin**
  * **Platform**: Android Native
  * **Arsitektur**:*MVVM (Model-View-ViewModel)
  * **UI Toolkit**: Jetpack Compose
  * **Build System**: Gradle dengan Kotlin DSL (`.kts`)
  * **Library Utama yang Digunakan**:
      * Android Jetpack (ViewModel, LiveData/Flow, Navigation Component)

## 📸 Screenshots
<table>
  <tr>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/7d43fcb4-4b7f-4e43-b415-315b7506c0ca" width="300"/>
    </td>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/b7453bdd-18a8-45d5-9f64-2769e5104d66" width="300"/>
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/2405b50b-deb1-4ba6-b369-09315db480ec" width="300"/>
    </td>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/f07d0f1e-136d-48c5-a2ef-d5c6bbcefb76" width="300"/>
    </td>
  </tr>
  <tr>
    <td align="center" colspan="2">
      <img src="https://github.com/user-attachments/assets/330e58f1-5cf6-48f2-97c7-1cf5660db030" width="300"/>
    </td>
  </tr>
</table>

## 🚀 Cara Menjalankan Proyek

1.  **Clone** repositori ini ke komputer Anda.
2.  Buka proyek menggunakan versi terbaru dari **Android Studio**.
3.  Tunggu hingga Android Studio selesai melakukan **Gradle Sync** dan mengunduh semua dependensi yang dibutuhkan.
4.  Pilih target (Emulator atau perangkat Android fisik).
5.  Klik **Run 'app'** untuk membangun dan menjalankan aplikasi.
