package com;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityPart3Application {

	public static void main(String[] args) throws ReflectiveOperationException  {
		//SpringApplication.run(SpringSecurityPart3Application.class, args);
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		//LocalDate date = LocalDate.
		String osFormat = DateTimeFormatterBuilder.getLocalizedDateTimePattern(
			            FormatStyle.SHORT, FormatStyle.LONG, IsoChronology.INSTANCE, Locale.getDefault());
		System.out.println(osFormat);
		System.out.println(getSystemDateFormat());
		
	}
	private static DateFormat getSystemDateFormat() throws ReflectiveOperationException {
        Class<?> clazz = Class.forName("sun.util.locale.provider.HostLocaleProviderAdapterImpl");
        Method method = clazz.getMethod("getDateFormatProvider");
        DateFormatProvider dateFormatProvider = (DateFormatProvider)method.invoke(null);
        DateFormat dateFormat = dateFormatProvider.getDateInstance(DateFormat.MEDIUM, Locale.getDefault(Locale.Category.FORMAT));
        return dateFormat;
    }

}
