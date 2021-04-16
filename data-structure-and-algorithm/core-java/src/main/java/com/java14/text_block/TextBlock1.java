package java14.text_block;

public class TextBlock1 {

	public static void main(String[] args) {
		String text = """
                Did you know \
                Java 14 \
                has the most features among\
                all non-LTS versions so far\
                """;
		System.out.println(text);	
		String text2 = """
                line1
                line2 \s
                line3
                """;
		System.out.println(text2);	
		String text3 = "line1\nline2 \nline3\n";
		System.out.println(text3);	
		
		System.out.println("************ 2nd example **********");
		
		String html = "<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";

		String java13 = """
                  <html>
                      <body>
                          <p>Hello, World</p>
                      </body>
                  </html>
                  """;

		String java14 = """
                  <html>
                      <body>\
                          <p>Hello, '\s' World</p>\
                      </body>
                  </html>
                  """;

	  System.out.println(html);
	  System.out.println(java13);
	  System.out.println(java14);
	  
	  String html2 =  """
              <html>
                  <body>
                      <p>Hello, World</p>
                  </body>
              </html>
				        """;

	  String json = """
              {
                  "name":"mkyong",
                  "age":38,
                  "list":[a,b,c,d]
              }
              """;
	  
	  System.out.println(html2);
	  System.out.println(json);
	}
}
