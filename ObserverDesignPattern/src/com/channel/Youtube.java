package com.channel;

public class Youtube {
  public static void main(String[] args)
  {
	  Channel channelName =new Channel();
	  Subscriber s1 = new Subscriber("Satya");
	  Subscriber s2 = new Subscriber("Subbu");
	  Subscriber s3 = new Subscriber("Saurav");
	  Subscriber s4 = new Subscriber("Anurag");
	  Subscriber s5 = new Subscriber("Guru");
	  Subscriber s6 = new Subscriber("Harsha");

	  channelName.subscribe(s1);
	  channelName.subscribe(s2);
	  channelName.subscribe(s3);
	  channelName.subscribe(s4);
	  channelName.subscribe(s5);
	  channelName.subscribe(s6);
	  
      s1.subscribeChannel(channelName);
      s2.subscribeChannel(channelName);
      s3.subscribeChannel(channelName);
      s4.subscribeChannel(channelName);
      s5.subscribeChannel(channelName);
      s6.subscribeChannel(channelName);

      channelName.upload("Bridgelabz 30 CodingClub BootCamp");
  }
}
