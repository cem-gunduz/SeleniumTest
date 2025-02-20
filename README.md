# SeleniumTest
Trendyol test project create with selenium. Firstly I create java project then I downloaded chrome driver file because I use chrome then I added required dependencies like selenium-java in pom.xml file.

1.Case SearchFunctionally

Code start to open trendyol website. Then code search product name of "kablosuz kulaklik".
As a result of the search, the products searched for in the lower bar are compared with the products found and If it is true: "Arama sonucu doğru", search result is :"Arama sonucu yanlış".
If it is wrong,search result is :"Arama sonucu yanlış"

2. Case ProductSelection
   
Code start to open trendyol website. Then code search product name of "kablosuz kulaklik".
Then Take name and price of second product
Then enter product. Prints the full name and price of selected product.
By the way, the errors in the comparison with the name on the second page could not be fixed.

3.Case AddToCart

Code start to open trendyol website. Then code search product name of "kablosuz kulaklik".
First product opens. Then wait 2 seconds. Opened product is added to the cart. Then go to the cart page and check if the product has been added.
If cart has product, result is : "Ürün sepete başarıyla eklendi"
If cart hasn't product,result is : "Ürün sepete eklenemedi".
