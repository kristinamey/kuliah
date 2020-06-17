<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class tentanggereja extends CI_Controller {

	public function index()
	{
		$this->load->view('header');
		$this->load->view('tentanggereja');
		$this->load->view('footer');
	}
}
