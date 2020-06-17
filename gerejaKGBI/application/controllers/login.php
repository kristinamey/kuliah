<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class login extends CI_Controller {

	function __construct()
	{
		parent::__construct();		
		$this->load->model('m_login');
	}

	public function index()
	{
		$this->load->view('login');
	}

	public function auth()
	{
		$username = $this->input->post('username');
		$katasandi = md5($this->input->post('password'));

		$where = array(
			'username' => $username,
			'katasandi' => $katasandi
		);

		$jumlahData =  $this->m_login->cek_login("admin", $where)->num_rows();

		if ($jumlahData > 0) {
			$data_session = array(
				'namauser' => $username,
				'status' => "login"
				);

			$this->session->set_userdata($data_session);
			redirect(base_url("beranda"));
		} else {
			echo "<script> alert('Username / Password Salah!'); window.location = '../login' </script>";
			//redirect(base_url("login"));
		}
	}

	function logout()
	{
		$this->session->sess_destroy();
		redirect(base_url('login'));
	}
}
