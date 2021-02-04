/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman;



/**
 *
 * @author Asus
 */
 class stack {    
    private int maxSize;
    private String[] idArray;
    private String[] namabarArray;
    private String[] jumlahArray;
    private String[] tglpinArray;
    private String[] tglkemArray;
    private String[] namapemArray;
    private int topid;
    private int topnamabar;
    private int topjml;
    private int toptglpin;
    private int toptglkem;
    private int topnamapem;
    private String nomor;
    private String jenis;
    private String nominal;
    public stack(int max) {
      maxSize = max;
      idArray = new String[maxSize];
      namabarArray = new String[maxSize];
      jumlahArray = new String[maxSize];
      tglpinArray = new String[maxSize];
      tglkemArray = new String[maxSize];
      namapemArray= new String[maxSize];
      topid = -1;
      topnamabar = -1;
      topjml = -1;
      toptglpin=-1;
      toptglkem = -1;
      topnamapem=-1;
    }
    public void push(String a , String b , String c , String d,String e, String f) {
      idArray[++topid] = a;
     namabarArray[++topnamabar] = b;
     jumlahArray[++topjml] = c;
     tglpinArray[++toptglpin] = d;
     tglkemArray[++toptglkem] = e;
     namapemArray[++topnamapem] = f;
    }
    public String popid() {
      return idArray[topid--];
    }
     public String popNamabar() {
      return namabarArray[topnamabar--];
    }
      public String popjum() {
      return jumlahArray[topjml--];
    }
       public String poptglpinjam() {
      return tglpinArray[toptglpin--];
    }
       public String poptglkembali() {
      return tglkemArray[toptglkem--];
    }
       public String popnampeminjam() {
      return namapemArray[topnamapem--];
    }
    public String peekid() {
      return idArray[topid];
    }
    public String peeknamabarang() {
      return namabarArray[topnamabar];
    }
    public String peekjumlah() {
      return jumlahArray[topjml];
    }
    public String peektglpinjam() {
      return tglpinArray[toptglpin];
    }
    public String peektglkembali() {
      return tglkemArray[toptglkem];
    }
    public String peeknamapeminjam() {
      return namapemArray[topnamapem];
    }
    public boolean isEmpty() {
      return (topid == -1);
    }
    public boolean isFull() {
      return (topid == maxSize-1);
    }
     public int size(){
        return topid+1;
    }
    public String peekid(int n){
        return idArray[n];
    }
     public String peeknamabar(int n){
        return namabarArray[n];
    }
      public String peekjumlah(int n){
        return jumlahArray[n];
    }
       public String peektglpinjam(int n){
        return tglpinArray[n];
    }
       public String peektglkembali(int n){
        return tglkemArray[n];
    }
       public String peeknamapeminjam(int n){
        return namapemArray[n];
    }
  }


