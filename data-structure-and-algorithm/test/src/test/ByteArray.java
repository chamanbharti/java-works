package test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ByteArray {

	public static void main(String[] args) {
		String str = "Aconverting to input stream" + "\n and this is second line";
		//String str = "0x010000000300FFFEFF3A5300610074006F007200690020006F006E006C00790028005500530020006F007200200055004B002900200065006C00730065002000750073006500200063006F0075006E007400720079005F0063006F00640065003200200062006C0061006E006B00200066006F007200200061006C006C00FFFEFF1541006C006C00200043004100500053002000280054007200750065002F00460061006C00730065002900FFFEFF2E4100640064006900740069006F006E0061006C002000270077006800650072006500200063006C0061007500730065002700200066006F00720020007200650063006F00720064002000730065006C0065006300740069006F006E0003000500050005000300FFFEFF0255005300FFFEFF05460061006C0073006500FFFEFF00";
		byte[] content = str.getBytes();
		InputStream is = null;
		BufferedReader bfReader = null;
		try {
			is = new ByteArrayInputStream(content);
			bfReader = new BufferedReader(new InputStreamReader(is));
			String temp = null;
			while ((temp = bfReader.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (Exception ex) {

			}
		}
	}
}
