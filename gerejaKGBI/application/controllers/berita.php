<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class berita extends CI_Controller {

	public function index()
	{
		$this->load->view('header');
		$this->load->view('berita');
		$this->load->view('footer');
	}
}
