# SeleniumTest
Trendyol test with selenium
Öncelikle bir java projesi oluşturuldu. Daha sonra chrome da çalışıldığı için chrome driver dosyası indirilip projemizin resources dosyasına atıldı.
Sonrasında pom dosyası içine selenium-java gibi gerekli dependencyler eklendi.
1.koşul SearchFunctionally
Kod önce trenyol sitesine girer. Ardından "kablosuz kulaklik" adındaki ürünü arar.
Arama sonucunda alttaki barda aranan ürün ile çıkan ürünler karşılaştırılır ve doğruysa "Arama sonucu doğru"
yanlış ise "Arama sonucu yanlış" yazdırılır.

2. Koşul ProductSelection tamamlanmadı.
Kod trenyol sitesini açar. Ardından "kablosuz kulaklik" adındaki ürünü arar.
Çıkan ürünlerden ikincinin adını birinci ve ikinci adını alır ardında fiyuatını alır.
Daha sonra ürüne girer. Alınan ürünün tam adını ve üretini yazdırır.
Buarada iknici sayfadaki isimle karşılaştırma kısmındaki hatalar giderilemedi.

3.Koşul AddToCart
Kod trenyol sitesini açar. Ardından "kablosuz kulaklik" adındaki ürünü arar.
İlk ürün açılır. Ardında 2 saniye beklenir. Açılan ürün sepete eklenir. Sonra sepet sayfasına gidilir ve ürün eklenmişmi diye kontrol edilir.
Eklenmmiş ise "Ürün sepete başarıyla eklendi" yazdırılır.
Eklenmediyse "Ürün sepete eklenemedi" yazdırılır.
