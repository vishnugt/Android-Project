﻿namespace WindowsFormsApplication1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.lstCommands = new System.Windows.Forms.ListView();
            this.lblTimer = new System.Windows.Forms.Label();
            this.ShutdownTimer = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // lstCommands
            // 
            this.lstCommands.Location = new System.Drawing.Point(0, 0);
            this.lstCommands.Name = "lstCommands";
            this.lstCommands.Size = new System.Drawing.Size(121, 97);
            this.lstCommands.TabIndex = 0;
            this.lstCommands.UseCompatibleStateImageBehavior = false;
            // 
            // lblTimer
            // 
            this.lblTimer.AutoSize = true;
            this.lblTimer.Location = new System.Drawing.Point(191, 39);
            this.lblTimer.Name = "lblTimer";
            this.lblTimer.Size = new System.Drawing.Size(43, 13);
            this.lblTimer.TabIndex = 1;
            this.lblTimer.Text = "lblTimer";
            // 
            // ShutdownTimer
            // 
            this.ShutdownTimer.Tick += new System.EventHandler(this.ShutdownTimer_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 261);
            this.Controls.Add(this.lblTimer);
            this.Controls.Add(this.lstCommands);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListView lstCommands;
        public System.Windows.Forms.Label lblTimer;
        private System.Windows.Forms.Timer ShutdownTimer;
    }
}

