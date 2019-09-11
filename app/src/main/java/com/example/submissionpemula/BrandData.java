package com.example.submissionpemula;

import java.security.PrivateKey;
import java.util.ArrayList;

public class BrandData {

//    private static String[] brandNames = {
//            "Xiaomi",
//            "OPPO",
//            "SAMSUNG",
//            "SONY",
//            "LG",
//            "HTC",
//            "ASUS",
//            "HUAWEI",
//            "MEIZU",
//            "VIVO"
//    };
//
//    private static String[] brandDetails = {
//            "Xiaomi","Di awal berdirinya Xiaomi, mungkin di Indonesia masih sedikit sekali atau bahkan belum ada yang mengenal nama Xiaomi.Namun perlahan tapi pasti, Xiaomi kini menjadi salah satu merk HP terbaik di planet bumi.Kebanyakan produk-produk HP buatan Xiaomi adalah HP dengan spesifikasi jempolan, tapi dijual dengan harga yang murah.Itu bukan karena HP Xiaomi yang murahan, tapi karena memang perusahaan asal tirau bambu tersebut hanya mengambil sedikit untung saja.Prinsip jualan Xiaomi adalah untung sedikit setiap penjualan, tapi terjual banyak.Selain itu yang membuat harga HP Xiaomi menjadi murah adalah karena gaya promosi Xiaomi yang menggunakan online ketimbang media seperti TV atau pamflet.Hal ini menekan biaya anggaran sehingga Xiaomi bisa tetap menjual produk-produknya dengan harga murah.",
//            "OPPO","Salah satu kelebihan Oppo dibandingkan pabrikan HP lainnya adalah dari sektor kamera. Oppo memprioritaskan kamera sebagai salah satu fitur yang wajib diperhatikan. Karenanya kini produk-produk Oppo terkenal dengan kameranya yang oke punya. Sehingga sebagian besar pengguna produk Oppo adalah para penggemar fotografi, anak muda yang doyan selfi, hingga para Youtuber. Bahkan Oppo kini dikenal sebagai salah satu pabrikan HP dengan kualitas kamera terbaik.",
//            "SAMSUNG","Samsung adalah salah satu nama besar dalam industri elektronik. Termasuk dalam dunia smartphone, Samsung adalah salah satu pemain terbaik. HP Samsung bisa kita temukan dimana saja dibelahan dunia. Ini membuktikan bahwa dominasi nama Samsung masih terasa hingga sekarang walaupun adanya vendor-vendor smartphone lain seperti Xiaomi dan Oppo. Samsung juga selalu berinovasi dengan menghadirkan teknologi dan fitur baru dalam setiap smartphone flagship terbarunya. Salah satu yang paling terkenal adalah Bixby, asisten pintar yang diklaim lebih canggih dari Siri milik Apple. Walaupun rata-rata harga smartphone Samsung lebih mahal dibandingkan Xiaomi, tapi penjualan HP Samsung tidak pernah sepi. Ini menunjukkan bahwa Samsung sudah punya pasarnya sendiri. Sama seperti Apple dengan produk-produk iDevice nya.",
//            "SONY","Hampir sama seperti Oppo. HP buatan Sony juga terkenal akan kualitas kameranya yang mumpuni. Ini tidak aneh karena memang Sony juga berkecimpung dalam dunia kamera. Sony sudah berpengalaman dalam dunia per-kamera-an. Bahkan sensor kamera iPhone terdahulu menggunakan sensor kamera buatan Sony. Salah satu ciri khas produk HP Sony selain kameranya yang bagus adalah bentuknya yang elegan.Rata-rata HP Sony menggunakan desain balok, yang artinya minim lengkungan di sisi-sisinya. Lalu Sony juga selalu menambahkan fitur andalannya yaitu Bravia, yang memungkinkan tampilan gambar menjadi lebih hidup di setiap HP buatannya.",
//            "LG","Hampir sama seperti Samsung, LG juga sudah lebih dulu dikenal sebagai pembuat berbagai macam barang elektronik sebelum akhirnya juga membuat smartphone. Pengalamannya dalam membuat barang elektronik tentu membuat produk-produk HP LG memiliki kualitas tersendiri. Google bahkan pernah menunjuk LG untuk memproduksi smartphone Nexus yang terkenal itu. Ciri khas produk LG adalah desain HP yang elegan dan tampak berbeda dari buatan pabrik lainnya.",
//            "HTC","HTC awalnya tidak begitu dikenal. Namun lambat laun, produk-produk HP buatan HTC mulai dilirik karena memiliki kualitas yang bagus. Beberapa kelebihan HP buatan HTC antara lain adalah materaial yang digunakannya, yang terbukti kuat. Selain itu, dari segi audio juga sangat memanjakan penggunanya. Kedua perpaduan tersebut tentu sangat cocok untuk Sobat Androbuntu yang gemar mendengarkan musik. HTC juga diketahui lebih sering menggunakan Qualcomm sebagai dapur pacunya. Ini sangat berpengaruh terhadap performa HP, dan tentu sangat cocok untuk main game serta pekerjaan berat lainnya.",
//            "ASUS","Seingat saya, dulu Asus adalah salah satu vendor smartphone yang mengadopsi prosesor Intel. Ya walaupun tidak begitu diminati waktu itu, ini membuktikan bahwa Asus adalah tipe produsen HP yang gemar berinovasi. HP Android buatan Asus biasanya dibekali dengan antarmuka buatan Asus sendiri yang disebut dengan ZenUI. Tampilannya elegan dan sederhana. Tampilan ini hanya tersedia untuk HP buatan Asus, sehingga menambah kesan eksklusif untuk HP buatan Asus. Baru-baru ini Asus juga mengembangkan teknologi bernama PixelMAster Camera. Dengan teknologi tersebut, foto-foto yang diambil dari HP Asus akan terlihat lebih baik dari segi pencahayaan. Cocok deh untuk Sobat Androbuntu yang gemar fotografi.",
//            "HUAWEI","Huawei paham betul keinginan konsumen, yaitu HP dengan harga yang murah sekaligus desain yang elegan. Dua hal itulah yang kini melekat di produk-produk HP Huawei. Sepertinya kedua ciri khas tersebut terinspirasi dari Xiaomi dan juga Apple. Tidak heran kalau kini HP Huawei mulai banyak digunakan, baik di Indonesia ataupun negara lain. Ya walaupun saat ini belum setinggi Xiaomi tingkat penjualannya, tapi tidak menutup kemungkinan dimasa depan Huawei bisa merajai pasar HP dunia.",
//            "MEIZU","Jika saya perhatikan, Meizu menggunakan pendekatan yang hampir sama dengan Xiaomi. Pertama, Meizu banyak membuat HP dengan spesifikasi tinggi, kemudian dijual dengan harga murah. Kemudian Meizu juga banyak melakukan flash sale, seperti yang sering dilakukan Xiaomi ketika menjual produk-produk terbarunya. Dan satu lagi, Meizu juga mengembangkan antarmukanya sendiri yang diberi nama FlymeOS. Rata-rata HP buatan Meizu ini menggunakan casing berbahan metal.",
//            "VIVO","Vendor smartphone yang baru-baru ini sedang naik daun, yaitu Vivo juga masuk dalam jajaran merk HP paling laris di dunia. Vivo bahkan tidak tanggung-tanggung dalam melakukan promosi. Mereka merekrut beberapa selebritis papan atas tanah air untuk menjadi brand ambassadornya. Ini membuktikan bahwa Vivo semakin serius dengan bisnisnya. Kini Vivo sedang fokus pada lini HP untuk selfie dan fotografi. Hal ini terbukti dengan dirilisnya beberapa HP Android yang memiliki spesifikasi kamera yang mumpuni. Nah, Sobat Androbuntu yang gemar fotografi dari HP bisa memilih Vivo sebagai gadget andalan berikutnya."
//    };
//
//    private static int[] brandImages = {
//            R.drawable.xiaomi,
//            R.drawable.oppo,
//            R.drawable.samsung,
//            R.drawable.sony,
//            R.drawable.lg,
//            R.drawable.htc,
//            R.drawable.asus,
//            R.drawable.huawei,
//            R.drawable.meizu,
//            R.drawable.vivo
//    };
//
//    static ArrayList<Brand> getListData() {
//        ArrayList<Brand> list = new ArrayList<>();
//        for (int position = 0; position < brandNames.length; position++) {
//            Brand brand = new Brand();
//            brand.setName(brandNames[position]);
//            brand.setDetail(brandDetails[position]);
//            brand.setPhoto(brandImages[position]);
//            list.add(brand);
//        }
//        return list;
//    }
public static String[][] data = new String[][]{
        {"Xiaomi","Di awal berdirinya Xiaomi, mungkin di Indonesia masih sedikit sekali atau bahkan belum ada yang mengenal nama Xiaomi.Namun perlahan tapi pasti, Xiaomi kini menjadi salah satu merk HP terbaik di planet bumi.Kebanyakan produk-produk HP buatan Xiaomi adalah HP dengan spesifikasi jempolan, tapi dijual dengan harga yang murah.Itu bukan karena HP Xiaomi yang murahan, tapi karena memang perusahaan asal tirau bambu tersebut hanya mengambil sedikit untung saja.Prinsip jualan Xiaomi adalah untung sedikit setiap penjualan, tapi terjual banyak.Selain itu yang membuat harga HP Xiaomi menjadi murah adalah karena gaya promosi Xiaomi yang menggunakan online ketimbang media seperti TV atau pamflet.Hal ini menekan biaya anggaran sehingga Xiaomi bisa tetap menjual produk-produknya dengan harga murah.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/xiaomi.png"},
        {"OPPO","Salah satu kelebihan Oppo dibandingkan pabrikan HP lainnya adalah dari sektor kamera. Oppo memprioritaskan kamera sebagai salah satu fitur yang wajib diperhatikan. Karenanya kini produk-produk Oppo terkenal dengan kameranya yang oke punya. Sehingga sebagian besar pengguna produk Oppo adalah para penggemar fotografi, anak muda yang doyan selfi, hingga para Youtuber. Bahkan Oppo kini dikenal sebagai salah satu pabrikan HP dengan kualitas kamera terbaik.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/oppo.jpg"},
        {"SAMSUNG","Samsung adalah salah satu nama besar dalam industri elektronik. Termasuk dalam dunia smartphone, Samsung adalah salah satu pemain terbaik. HP Samsung bisa kita temukan dimana saja dibelahan dunia. Ini membuktikan bahwa dominasi nama Samsung masih terasa hingga sekarang walaupun adanya vendor-vendor smartphone lain seperti Xiaomi dan Oppo. Samsung juga selalu berinovasi dengan menghadirkan teknologi dan fitur baru dalam setiap smartphone flagship terbarunya. Salah satu yang paling terkenal adalah Bixby, asisten pintar yang diklaim lebih canggih dari Siri milik Apple. Walaupun rata-rata harga smartphone Samsung lebih mahal dibandingkan Xiaomi, tapi penjualan HP Samsung tidak pernah sepi. Ini menunjukkan bahwa Samsung sudah punya pasarnya sendiri. Sama seperti Apple dengan produk-produk iDevice nya.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/samsung.png"},
        {"SONY","Hampir sama seperti Oppo. HP buatan Sony juga terkenal akan kualitas kameranya yang mumpuni. Ini tidak aneh karena memang Sony juga berkecimpung dalam dunia kamera. Sony sudah berpengalaman dalam dunia per-kamera-an. Bahkan sensor kamera iPhone terdahulu menggunakan sensor kamera buatan Sony. Salah satu ciri khas produk HP Sony selain kameranya yang bagus adalah bentuknya yang elegan.Rata-rata HP Sony menggunakan desain balok, yang artinya minim lengkungan di sisi-sisinya. Lalu Sony juga selalu menambahkan fitur andalannya yaitu Bravia, yang memungkinkan tampilan gambar menjadi lebih hidup di setiap HP buatannya.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/sony.png"},
        {"LG","Hampir sama seperti Samsung, LG juga sudah lebih dulu dikenal sebagai pembuat berbagai macam barang elektronik sebelum akhirnya juga membuat smartphone. Pengalamannya dalam membuat barang elektronik tentu membuat produk-produk HP LG memiliki kualitas tersendiri. Google bahkan pernah menunjuk LG untuk memproduksi smartphone Nexus yang terkenal itu. Ciri khas produk LG adalah desain HP yang elegan dan tampak berbeda dari buatan pabrik lainnya.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/lg.png"},
        {"HTC","HTC awalnya tidak begitu dikenal. Namun lambat laun, produk-produk HP buatan HTC mulai dilirik karena memiliki kualitas yang bagus. Beberapa kelebihan HP buatan HTC antara lain adalah materaial yang digunakannya, yang terbukti kuat. Selain itu, dari segi audio juga sangat memanjakan penggunanya. Kedua perpaduan tersebut tentu sangat cocok untuk Sobat Androbuntu yang gemar mendengarkan musik. HTC juga diketahui lebih sering menggunakan Qualcomm sebagai dapur pacunya. Ini sangat berpengaruh terhadap performa HP, dan tentu sangat cocok untuk main game serta pekerjaan berat lainnya.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/htc.png"},
        {"ASUS","Seingat saya, dulu Asus adalah salah satu vendor smartphone yang mengadopsi prosesor Intel. Ya walaupun tidak begitu diminati waktu itu, ini membuktikan bahwa Asus adalah tipe produsen HP yang gemar berinovasi. HP Android buatan Asus biasanya dibekali dengan antarmuka buatan Asus sendiri yang disebut dengan ZenUI. Tampilannya elegan dan sederhana. Tampilan ini hanya tersedia untuk HP buatan Asus, sehingga menambah kesan eksklusif untuk HP buatan Asus. Baru-baru ini Asus juga mengembangkan teknologi bernama PixelMAster Camera. Dengan teknologi tersebut, foto-foto yang diambil dari HP Asus akan terlihat lebih baik dari segi pencahayaan. Cocok deh untuk Sobat Androbuntu yang gemar fotografi.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/asus.png"},
        {"HUAWEI","Huawei paham betul keinginan konsumen, yaitu HP dengan harga yang murah sekaligus desain yang elegan. Dua hal itulah yang kini melekat di produk-produk HP Huawei. Sepertinya kedua ciri khas tersebut terinspirasi dari Xiaomi dan juga Apple. Tidak heran kalau kini HP Huawei mulai banyak digunakan, baik di Indonesia ataupun negara lain. Ya walaupun saat ini belum setinggi Xiaomi tingkat penjualannya, tapi tidak menutup kemungkinan dimasa depan Huawei bisa merajai pasar HP dunia.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/huawei.png"},
        {"MEIZU","Jika saya perhatikan, Meizu menggunakan pendekatan yang hampir sama dengan Xiaomi. Pertama, Meizu banyak membuat HP dengan spesifikasi tinggi, kemudian dijual dengan harga murah. Kemudian Meizu juga banyak melakukan flash sale, seperti yang sering dilakukan Xiaomi ketika menjual produk-produk terbarunya. Dan satu lagi, Meizu juga mengembangkan antarmukanya sendiri yang diberi nama FlymeOS. Rata-rata HP buatan Meizu ini menggunakan casing berbahan metal.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/meizu.png"},
        {"VIVO","Vendor smartphone yang baru-baru ini sedang naik daun, yaitu Vivo juga masuk dalam jajaran merk HP paling laris di dunia. Vivo bahkan tidak tanggung-tanggung dalam melakukan promosi. Mereka merekrut beberapa selebritis papan atas tanah air untuk menjadi brand ambassadornya. Ini membuktikan bahwa Vivo semakin serius dengan bisnisnya. Kini Vivo sedang fokus pada lini HP untuk selfie dan fotografi. Hal ini terbukti dengan dirilisnya beberapa HP Android yang memiliki spesifikasi kamera yang mumpuni. Nah, Sobat Androbuntu yang gemar fotografi dari HP bisa memilih Vivo sebagai gadget andalan berikutnya.","https://raw.githubusercontent.com/gnosprinting/submitpemula/master/vivo.png"},
};
    public static ArrayList<Brand> getListData(){
        ArrayList<Brand> list = new ArrayList<>();
        for (String[] aData : data) {
            Brand brand = new Brand();
            brand.setName(aData[0]);
            brand.setDetail(aData[1]);
            brand.setPhoto(aData[2]);
            list.add(brand);
        }
        return list;
    }
}
