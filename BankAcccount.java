class BankAcccount{
   int accNo;
   String name;
   int amount;
   BankAcccount(int accNo,String name,int amount){
   this.accNo=accNo;
   this.name=name;
   this.amount=amount;
   }
   public String withDraw(int WithDrawAmount){
     if(amount>WithDrawAmount && WithDrawAmount>0){
      this.amount-amount;
      return "with draw successfully";
     }else{
      return "insufficient balance";
     }
   }
  String deposite(int depositeAmount){
   if(depositeAmount<0){
    return "invalid amount";
  }else{
   return ""+(this.amount+=depositeAmount);
  }
}
  String DisplayBalance(){
   return "your account balance is"+amount+"rs";
  }
}