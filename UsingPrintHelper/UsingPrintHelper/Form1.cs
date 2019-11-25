using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UsingPrintHelper
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            AboutBox1 about = new AboutBox1();
            about.MdiParent = this;
            about.Show();
        }

        private void printHelperToolStripMenuItem_Click(object sender, EventArgs e)
        {
            PrintHelper print = new PrintHelper();
            print.MdiParent = this;
            print.Show();
        }
    }
}
