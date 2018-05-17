#!/usr/bin/env jruby
require 'pragmatic_segmenter'

ps = PragmaticSegmenter::Segmenter.new(text: text, language: 'de', doc_type: 'pdf')
ps.segment