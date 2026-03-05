class AirportSecurity{
  public static void main(String[] args){
    boolean hasTicket=true;
    boolean hasValidId=true;
    boolean hasProhibitedItem=false;
    boolean ClearedSecurityScan=true;
    boolean allowedToBoard=hasTicket && hasValidId && hasProhibitedItem && ClearedSecurityScan;
    System.out.println("Ticket Verified:"+hasTicket);
    System.out.println("Valid ID:"+hasValidId);
    System.out.println("Carry Prohibited Item:"+hasProhibitedItem);
    System.out.println("Security:"+ClearedSecurityScan);
    System.out.println("Allowed to Board:"+allowedToBoard);
  }
}
