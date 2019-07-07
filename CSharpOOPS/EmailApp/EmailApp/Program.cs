using System;


using EASendMail;
namespace EmailApp
{
    class Program
    {
        static void Main(string[] args)
        {
            SmtpMail oMail = new SmtpMail("TryIt");
            SmtpClient oSmtp = new SmtpClient();

            // Your gmail email address
            oMail.From = "walavalkaronkar@gmail.com";

            // Set recipient email address
            oMail.To = "onkarwal1234@gmail.com";

            // Set email subject
            oMail.Subject = "test email from gmail account";

            // Set email body
            oMail.TextBody = "this is a test email sent from c# project with gmail.";

            // Gmail SMTP server address
            SmtpServer oServer = new SmtpServer("smtp.gmail.com");

            // If you want to use direct SSL 465 port,
            // please add this line, otherwise TLS will be used.
            // oServer.Port = 465;

            // set 587 TLS port;
            oServer.Port = 587;

            // detect SSL/TLS automatically
            oServer.ConnectType = SmtpConnectType.ConnectSSLAuto;

            // Gmail user authentication
            // For example: your email is "gmailid@gmail.com", then the user should be the same
            oServer.User = "walavalkaronkar@gmail.com";
            oServer.Password = "Ofp 31196";

            try
            {
                Console.WriteLine("start to send email over SSL ...");
                oSmtp.SendMail(oServer, oMail);
                Console.WriteLine("email was sent successfully!");
            }
            catch (Exception ep)
            {
                Console.WriteLine("failed to send email with the following error:");
                Console.WriteLine(ep.Message);
            }
            Console.ReadKey();
        }
    }
    }
