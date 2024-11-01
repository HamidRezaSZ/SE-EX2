# SE-EX2

## مرحله دوم
<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>ساختن کلاس و ارث بری</p>
</td>
<td width="292">
<p>نوشتن کلاس و ارث بری از مدل MessageService</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>نوشتن متود validateTelegramId</p>
</td>
<td width="292">
<p>نوشتن یک تابع برای ولیدیت کردن آیدی و شماره تماس</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>نوشتن متود sendTelegramMessage</p>
</td>
<td width="292">
<p>نوشتن این تابع برای ارسال پیام</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 3

## مرحله سوم

<table dir='rtl'> <tbody> <tr> <td rowspan="2" width="240"> <p>اصل 1</p> <p>Single Responsibility</p> </td> <td width="95"> <p><strong>موارد تحقق</strong></p> </td> <td width="454"> <p>کلاس‌های MessageService و TelegramMessage هر کدام مسئولیت مشخصی دارند. MessageService مسئول ارسال پیام‌ها و TelegramMessage مسئول ارسال پیام‌های تلگرامی است.</p> </td> </tr> <tr> <td> <p><strong>موارد نقض</strong></p> </td> <td> <p>در صورتی که کلاس TelegramMessage مسئولیت‌های دیگری نیز داشته باشد، این اصل نقض می‌شود.</p> </td> </tr> <tr> <td rowspan="2"> <p>اصل 2</p> <p>Open-Close Principle (OCP)</p> </td> <td> <p><strong>موارد تحقق</strong></p> </td> <td> <p>کلاس TelegramMessage با افزودن متدهای جدید بدون تغییر در کلاس‌های موجود توسعه یافته است.</p> </td> </tr> <tr> <td> <p><strong>موارد نقض</strong></p> </td> <td> <p>در صورتی که برای افزودن قابلیت‌های جدید نیاز به تغییر در کلاس‌های موجود باشد، این اصل نقض می‌شود.</p> </td> </tr> <tr> <td rowspan="2"> <p>اصل 3</p> <p>Liskov Substitution Principle</p> </td> <td> <p><strong>موارد تحقق</strong></p> </td> <td> <p>کلاس TelegramMessage از MessageService ارث‌بری کرده و می‌تواند به جای MessageService استفاده شود.</p> </td> </tr> <tr> <td> <p><strong>موارد نقض</strong></p> </td> <td> <p>در صورتی که کلاس TelegramMessage نتواند به درستی به جای MessageService استفاده شود، این اصل نقض می‌شود.</p> </td> </tr> <tr> <td rowspan="2"> <p>اصل 4</p> <p>Interface Segregation Principle</p> </td> <td> <p><strong>موارد تحقق</strong></p> </td> <td> <p>واسط MessageService به گونه‌ای طراحی شده که هر کلاس می‌تواند تنها متدهای مورد نیاز خود را پیاده‌سازی کند.</p> </td> </tr> <tr> <td> <p><strong>موارد نقض</strong></p> </td> <td> <p>در صورتی که واسط MessageService شامل متدهایی باشد که همه کلاس‌ها به آن نیاز ندارند، این اصل نقض می‌شود.</p> </td> </tr> <tr> <td rowspan="2"> <p>اصل 5</p> <p>Dependency Inversion Principle</p> </td> <td> <p><strong>موارد تحقق</strong></p> </td> <td> <p>کلاس TelegramMessage وابستگی به واسط MessageService دارد و نه به پیاده‌سازی‌های خاص.</p> </td> </tr> <tr> <td> <p><strong>موارد نقض</strong></p> </td> <td> <p>در صورتی که کلاس TelegramMessage به پیاده‌سازی‌های خاص وابسته باشد، این اصل نقض می‌شود.</p> </td> </tr> </tbody> </table>

## مرحله چهارم

<table dir='rtl'> <tbody> <tr> <td width="168"> <p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p> </td> <td width="246"> <p><strong>علت نقض</strong></p> </td> <td width="284"> <p><strong>راه حل پیشنهادی</strong></p> </td> </tr> <tr> <td width="168"> <p>Single Responsibility</p> </td> <td width="246"> <p>در صورتی که کلاس TelegramMessage مسئولیت‌های دیگری نیز داشته باشد.</p> </td> <td width="284"> <p>تفکیک مسئولیت‌ها به کلاس‌های مجزا.</p> </td> </tr> <tr> <td width="168"> <p>Open-Close Principle (OCP)</p> </td> <td width="246"> <p>در صورتی که برای افزودن قابلیت‌های جدید نیاز به تغییر در کلاس‌های موجود باشد.</p> </td> <td width="284"> <p>استفاده از ارث‌بری و پیاده‌سازی واسط‌ها برای افزودن قابلیت‌های جدید.</p> </td> </tr> <tr> <td width="168"> <p>Liskov Substitution Principle</p> </td> <td width="246"> <p>در صورتی که کلاس TelegramMessage نتواند به درستی به جای MessageService استفاده شود.</p> </td> <td width="284"> <p>اطمینان از اینکه کلاس‌های فرزند می‌توانند به جای کلاس‌های والد استفاده شوند.</p> </td> </tr> <tr> <td width="168"> <p>Interface Segregation Principle</p> </td> <td width="246"> <p>در صورتی که واسط MessageService شامل متدهایی باشد که همه کلاس‌ها به آن نیاز ندارند.</p> </td> <td width="284"> <p>تفکیک واسط‌ها به واسط‌های کوچکتر و خاص‌تر.</p> </td> </tr> <tr> <td width="168"> <p>Dependency Inversion Principle</p> </td> <td width="246"> <p>در صورتی که کلاس TelegramMessage به پیاده‌سازی‌های خاص وابسته باشد.</p> </td> <td width="284"> <p>استفاده از واسط‌ها به جای پیاده‌سازی‌های خاص.</p> </td> </tr> </tbody> </table>


## سوالات پایانی

1.
اگر از ابتدا با اصول SOLID پیش میرفتیم، فقط به تغییرات زیر نیاز بود:
1- ایجاد یک کلاس جدید.
2- ثبت سرویس جدید که این کار معمولاً با استفاده از Dependency Injection انجام می‌شود.
3- تغییرات جزئی در کلاس‌های موجود (در صورت لزوم): ممکن است نیاز باشد برخی از کلاس‌های موجود برای تعامل با سرویس جدید به روزرسانی شوند.
پس فقط دو تغییر نیاز بود.

2.
با تفکیک مسئولیت‌ها به کلاس‌های مجزا و استفاده از وراثت و چندریختی، کد ها به بخش‌های کوچکتر و قابل فهم‌تری تقسیم می‌شود که این کار باعث می‌شود که در ادامه بتوانیم به راحتی کد را تغییر داده و دیباگ کنیم. همچنین این امکان را میدهد تا به راحتی ویژگی‌های جدیدی را به سیستم خود اضافه کنیم بدون اینکه بخش‌های زیادی از کد را تغییر داد.