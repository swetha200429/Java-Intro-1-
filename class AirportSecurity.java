class AirportSecurity{
  public static void main(String[] args){
    boolean hasTicket=true;
    boolean hasValidId=true;
    boolean hasProhibitedItem=false;
    boolean ClearedSecurityScan=true;
    boolean allowedToBoard=hasTicket && hasValidId && hasProhibitedItem && ClearedSecurityScan;
  }
}
