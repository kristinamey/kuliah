<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class pelayanan extends CI_Controller {

	public function index()
	{
		$this->load->view('header');
		$this->load->view('pelayanan');
		$this->load->view('footer');
	}
}
