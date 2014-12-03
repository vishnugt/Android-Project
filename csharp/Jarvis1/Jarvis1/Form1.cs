using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

using System.Speech.Recognition;
using System.Speech.Synthesis;
using System.IO;
using System.Xml;



namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        SpeechRecognitionEngine _recognizer = new SpeechRecognitionEngine();
        SpeechSynthesizer JARVIS = new SpeechSynthesizer();
        string QEvent;
        string ProcWindow;
        double timer = 10;
        int count = 1;
        Random rnd = new Random();
        int manna = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            _recognizer.SetInputToDefaultAudioDevice();
            _recognizer.LoadGrammar(new Grammar(new GrammarBuilder(new Choices(File.ReadAllLines(@"E:\commands.txt")))));
            _recognizer.SpeechRecognized += new EventHandler<SpeechRecognizedEventArgs>(_recognizer_SpeechRecognized);
            _recognizer.RecognizeAsync(RecognizeMode.Multiple);
        }

        void _recognizer_SpeechRecognized(object sender, SpeechRecognizedEventArgs e)
        {
            int ranNum = rnd.Next(1, 10);
            string speech = e.Result.Text;
            switch (speech)
            {
                //GREETINGS

                case "sup":
                    JARVIS.Speak("Welcome my master, Vishnu Gt");
                    break;
                case "whats your honesty parameters":
                    JARVIS.Speak("To be honest its 80% and this belongs to the 20%");
                    break;
                case "what do you lack":
                case "can you answer all questions":
                case "how are you different from real living person":
                    JARVIS.Speak("I lack information and i regret it");
                    break;
                case "greet my friend":
                    JARVIS.Speak("Hey Vishnu's friend, You must be lucky to have my master as your friend in real life");
                    break;
                case "hello":
                case "hello jarvis":
                    if (ranNum < 6) { JARVIS.Speak("Hello sir"); }
                    else if (ranNum > 5) { JARVIS.Speak("Hi"); }
                    break;
                case "goodbye":
                case "goodbye jarvis":
                case "close":
                case "close jarvis":
                    JARVIS.Speak("Until next time");
                    Close();
                    break;
                case "jarvis":
                    if (ranNum < 5) { QEvent = ""; JARVIS.Speak("Yes sir"); }
                    else if (ranNum > 4) { QEvent = ""; JARVIS.Speak("Yes?, what can i do for you!!!"); }
                    break;

                //WEBSITES
                case "open facebook":
                    System.Diagnostics.Process.Start("http:\\www.facebook.com");
                    break;
                case "open google":
                    System.Diagnostics.Process.Start("http:\\www.google.com");
                    break;
                case "open vishnugt.com":
                    System.Diagnostics.Process.Start("http:\\www.vishnugt.com");
                    break;
                case "open avantgardetechz.com":
                    System.Diagnostics.Process.Start("http:\\www.avantgardetechz.com");
                    break;



                //SHELL COMMANDS
                case "open program":
                    System.Diagnostics.Process.Start("file location");
                    JARVIS.Speak("Loading");
                    break;

                //CLOSE PROGRAMS
                case "close program":
                    ProcWindow = "process name";
                    StopWindow();
                    break;

                //CONDITION OF DAY
                case "what time is it":
                    DateTime now = DateTime.Now;
                    string time = now.GetDateTimeFormats('t')[0];
                    JARVIS.Speak(time);
                    break;
                case "what day is it":
                    JARVIS.Speak(DateTime.Today.ToString("dddd"));
                    break;
                case "whats the date":
                case "whats todays date":
                    JARVIS.Speak(DateTime.Today.ToString("dd-MM-yyyy"));
                    break;

                //OTHER COMMANDS
                case "go fullscreen":
                    FormBorderStyle = FormBorderStyle.None;
                    WindowState = FormWindowState.Maximized;
                    TopMost = true;
                    JARVIS.Speak("expanding");
                    break;
                case "exit fullscreen":
                    FormBorderStyle = FormBorderStyle.Sizable;
                    WindowState = FormWindowState.Normal;
                    TopMost = false;
                    break;
                case "switch window":
                    SendKeys.Send("%{TAB " + count + "}");
                    count += 1;
                    break;
                case "reset":
                    count = 1;
                    timer = 11;
                    lblTimer.Visible = false;
                    ShutdownTimer.Enabled = false;
                    lstCommands.Visible = false;
                    break;
                case "out of the way":
                    if (WindowState == FormWindowState.Normal || WindowState == FormWindowState.Maximized)
                    {
                        WindowState = FormWindowState.Minimized;
                        JARVIS.Speak("My apologies");
                    }
                    break;
                case "come back":
                    if (WindowState == FormWindowState.Minimized)
                    {
                        JARVIS.Speak("Alright?");
                        WindowState = FormWindowState.Normal;
                    }
                    break;
                case "show commands":
                    string[] commands = (File.ReadAllLines(@"E:\commands.txt"));
                    JARVIS.Speak("Very well");
                    lstCommands.Items.Clear();
            //        lstCommands.SelectionMode = SelectionMode.None;
                    lstCommands.Visible = true;
                    foreach (string command in commands)
                    {
                        lstCommands.Items.Add(command);
                    }
                    break;
                case "hide listbox":
                    lstCommands.Visible = false;
                    break;


                //spells

                    
                case "expecto patronum":
                    if (manna !=100) 
                    JARVIS.Speak("You lack manna for this spell");
                  
                else
                    JARVIS.Speak("No one but only the master is allowed to use this spell");
                    break;
                case "kuchiyose no jutsu":
                    manna = 100;

                    JARVIS.Speak("The cheat for manna has been ativated master");
                    break;

                //SHUTDOWN RESTART LOG OFF
                case "shutdown":
                    if (ShutdownTimer.Enabled == false)
                    {
                        QEvent = "shutdown";
                        JARVIS.Speak("I will shutdown shortly");
                        lblTimer.Visible = true;
                        ShutdownTimer.Enabled = true;
                    }
                    break;
                case "log off":
                    if (ShutdownTimer.Enabled == false)
                    {
                        QEvent = "logoff";
                        JARVIS.Speak("Logging off");
                        lblTimer.Visible = true;
                        ShutdownTimer.Enabled = true;
                    }
                    break;
                case "restart":
                    if (ShutdownTimer.Enabled == false)
                    {
                        QEvent = "restart";
                        JARVIS.Speak("I'll be back shortly");
                        lblTimer.Visible = true;
                        ShutdownTimer.Enabled = true;
                    }
                    break;
                case "abort":
                    if (ShutdownTimer.Enabled == true)
                    {
                        QEvent = "abort";
                    }
                    break;
                case "speed up":
                    if (ShutdownTimer.Enabled == true)
                    {
                        ShutdownTimer.Interval = ShutdownTimer.Interval / 10;
                    }
                    break;
                case "slow down":
                    if (ShutdownTimer.Enabled == true)
                    {
                        ShutdownTimer.Interval = ShutdownTimer.Interval * 10;
                    }
                    break;
            }
        }

        private void ShutdownTimer_Tick(object sender, EventArgs e)
        {

            if (timer == 0)
            {
                lblTimer.Visible = false;
                ComputerTermination();
                ShutdownTimer.Enabled = false;
            }
            else if (QEvent == "abort")
            {
                timer = 10;
                lblTimer.Visible = false;
                ShutdownTimer.Enabled = false;
            }
            else
            {
                timer = timer - .01;
                lblTimer.Text = timer.ToString();
            }

        }


        private void ComputerTermination()
        {
            switch (QEvent)
            {
                case "shutdown":
                    System.Diagnostics.Process.Start("shutdown", "-s");
                    break;
                case "logoff":
                    System.Diagnostics.Process.Start("shutdown", "-l");
                    break;
                case "restart":
                    System.Diagnostics.Process.Start("shutdown", "-r");
                    break;
            }
        }
        private void StopWindow()
        {
            System.Diagnostics.Process[] procs = System.Diagnostics.Process.GetProcessesByName(ProcWindow);
            foreach (System.Diagnostics.Process proc in procs)
            {
                proc.CloseMainWindow();
            }
        }
    }
}
