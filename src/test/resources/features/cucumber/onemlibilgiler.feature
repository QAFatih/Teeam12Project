#   Framework olusturacak kisilerin dikkatine:
#  projeyi olusturduktan sonra selenium dersinde ogrendigimiz komutlar takip edilir ve eklemeler yapilir

#   Package, classlar vb olusturulduktan sonra
#   Projeyi git ile iliskilendirmeden once bir kere projeyi run edip:
#   target dosyasinin gelmesini saglayip daha sonra:
#   proje seviyesinde bir file olusturup adini:
#  .gitignore yapmak ve bu dosyanin icine de:
#  .idea ve target yazmak gerekiyor
#  buraya  test-output da eklenebilir. eger bu ucu de eklenmisse bir sorun kalmayacaktir
#  bu yontem ile githubdaki cakismalari en aza indirebiliriz.

#  Eger bu adimi yapmayi tamamen(hic .gitignore olusturmadiniz) unuttuysaniz:
#  bunun icin calismalarimizi github'a her push etmeden once:
#  terminale mvn clean yazilabilir. Bu target dosyasini silmeye yarar
#  Eger kirmizi yazilarla hata aliniyorsa:
#  bunun nedeni maven yuklu olmadigi icindir ve bu islem manuel yapilabilir:
#  en sagdaki maven yazisina tiklanir(Notifications'in ustunde) --> lifecycle --> clean  yapilabilir

#  .idea ve target eklediniz ancak test output'u .gitignore icine koymadiniz ve sorun mu yasiyorsunuz?
#  test outputlarin da githuba her push islemi yapilmadan once silinmesi yararimiza olur
#  her seferinde silme islemiyle ugrasmak yerine:
#  test output, target dosyasinin altina da alinabilir
#  boylece target dosyamiz zaten .gitignore icinde oldugundan(veya .gitignore yok ancak mvn clean yaptigimizda)
#  test output da target dosyasi ile beraber silinmis veya zaten githuba hic gonderilmemis olur
#  test outputu taget dosyasinin altina alabilmek icin resources --> extent.properties -->
#  extent.reporter.spark.out=
#  extent.reporter.pdf.out=
#  screenshot.dir=
#  bu kisimlara karsilik gelen pathlerin onune target eklenir --> target/test-output.....(bu sekilde gorunmelidir)



#  Sonra:(framework olusturmanin diger adimlari)
#  VCS altindaki enable version control integration ile git ile iliskilendirebiliriz
#  gelen git sekmesinden --> Github --> Share project on github --> adimlar takip edilip git add yapilir
#  bu adimlar terminalde git add, git commit vb komutlari kullanilarak da takip edilebilir
#  githuba gonderirken projenin private secilmesi tercih edilir.

#  git log --oneline ile master ile kendi branchim arasinda hangisinin daha guncel oldugunu gorebilir,
#  en ustte olan en gunceldir,
#  buna gore esitlemek amacli merge islemini yapabilirim
#  hangisi yukaridaysa o guncel olacagi icin asagida kalan branche gidip git merge <yukarida kalanin ismi> yaparim